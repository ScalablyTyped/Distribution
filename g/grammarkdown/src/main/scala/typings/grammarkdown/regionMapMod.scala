package typings.grammarkdown

import typings.grammarkdown.nodesMod.SourceFile
import typings.std.Generator
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionMapMod {
  
  @JSImport("grammarkdown/dist/regionMap", "RegionMap")
  @js.native
  class RegionMap[T] protected ()
    extends StObject
       with ReadonlyRegionMap[T] {
    def this(equateValues: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
    
    var _equateRegions: js.Any = js.native
    
    var _sourceFileRegions: js.Any = js.native
    
    def addRegion(sourceFile: String, line: Double, value: T): Unit = js.native
    /**
      * Adds a `Region` for a source file.
      * @param sourceFile The source file in which to add a region
      * @param line The line number of the region start
      * @param value The value for the region
      */
    def addRegion(sourceFile: SourceFile, line: Double, value: T): Unit = js.native
    
    def copyFrom(other: RegionMap[T]): Unit = js.native
    
    def findRegion(sourceFile: String, line: Double): js.UndefOr[Region[T]] = js.native
    /* CompleteClass */
    override def findRegion(sourceFile: SourceFile, line: Double): js.UndefOr[Region[T]] = js.native
    
    def regions(sourceFile: String, line: Double): Generator[Region[T], Unit, js.Any] = js.native
    /* CompleteClass */
    override def regions(sourceFile: SourceFile, line: Double): IterableIterator[Region[T]] = js.native
    
    def upsertRegion(sourceFile: String, line: Double, upsert: js.Function1[/* value */ js.UndefOr[T], T]): Unit = js.native
    /**
      * Adds or updates a `Region` for a source file.
      * @param sourceFile The source file in which to add a region
      * @param line The line number of the region start
      * @param value The value for the region
      */
    def upsertRegion(sourceFile: SourceFile, line: Double, upsert: js.Function1[/* value */ js.UndefOr[T], T]): Unit = js.native
  }
  
  trait ReadonlyRegionMap[T] extends StObject {
    
    def findRegion(sourceFile: SourceFile, line: Double): js.UndefOr[Region[T]]
    
    def regions(sourceFile: SourceFile, line: Double): IterableIterator[Region[T]]
  }
  object ReadonlyRegionMap {
    
    @scala.inline
    def apply[T](
      findRegion: (SourceFile, Double) => js.UndefOr[Region[T]],
      regions: (SourceFile, Double) => IterableIterator[Region[T]]
    ): ReadonlyRegionMap[T] = {
      val __obj = js.Dynamic.literal(findRegion = js.Any.fromFunction2(findRegion), regions = js.Any.fromFunction2(regions))
      __obj.asInstanceOf[ReadonlyRegionMap[T]]
    }
    
    @scala.inline
    implicit class ReadonlyRegionMapMutableBuilder[Self <: ReadonlyRegionMap[?], T] (val x: Self & ReadonlyRegionMap[T]) extends AnyVal {
      
      @scala.inline
      def setFindRegion(value: (SourceFile, Double) => js.UndefOr[Region[T]]): Self = StObject.set(x, "findRegion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegions(value: (SourceFile, Double) => IterableIterator[Region[T]]): Self = StObject.set(x, "regions", js.Any.fromFunction2(value))
    }
  }
  
  trait Region[T] extends StObject {
    
    val line: Double
    
    val value: T
  }
  object Region {
    
    @scala.inline
    def apply[T](line: Double, value: T): Region[T] = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region[T]]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region[?], T] (val x: Self & Region[T]) extends AnyVal {
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
