package typings.grammarkdown.regionMapMod

import typings.grammarkdown.nodesMod.SourceFile
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/regionMap", "RegionMap")
@js.native
class RegionMap[T] protected () extends ReadonlyRegionMap[T] {
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
  
  def regions(sourceFile: String, line: Double): Generator[Region[T], Unit, _] = js.native
  
  def upsertRegion(sourceFile: String, line: Double, upsert: js.Function1[/* value */ js.UndefOr[T], T]): Unit = js.native
  /**
    * Adds or updates a `Region` for a source file.
    * @param sourceFile The source file in which to add a region
    * @param line The line number of the region start
    * @param value The value for the region
    */
  def upsertRegion(sourceFile: SourceFile, line: Double, upsert: js.Function1[/* value */ js.UndefOr[T], T]): Unit = js.native
}
