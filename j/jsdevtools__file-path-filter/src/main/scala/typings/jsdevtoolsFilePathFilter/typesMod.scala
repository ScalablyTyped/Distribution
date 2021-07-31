package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.anon.PartialFiltersFilterCrite
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyFilter = FilterCriteria | PartialFiltersFilterCrite
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.include
    - typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.exclude
  */
  trait Filter extends StObject
  object Filter {
    
    @scala.inline
    def exclude: typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.exclude = "exclude".asInstanceOf[typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.exclude]
    
    @scala.inline
    def include: typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.include = "include".asInstanceOf[typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.include]
  }
  
  type FilterCriteria = FilterCriterion | js.Array[FilterCriterion]
  
  type FilterCriterion = Boolean | String | RegExp | FilterFunction
  
  @js.native
  trait FilterFunction extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  trait Filters[T] extends StObject {
    
    var exclude: T
    
    var include: T
  }
  object Filters {
    
    @scala.inline
    def apply[T](exclude: T, include: T): Filters[T] = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters[T]]
    }
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters[?], T] (val x: Self & Filters[T]) extends AnyVal {
      
      @scala.inline
      def setExclude(value: T): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclude(value: T): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapFunction extends StObject {
    
    def apply(args: js.Any*): String = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that maps each filtered item to a file path.  This allows you to filter things
      * other than strings.
      *
      * Defaults to a function that returns the first argument as a string.
      */
    var map: js.UndefOr[MapFunction] = js.undefined
    
    /**
      * The path separator. This allows you to filter paths from
      * other operating systems (e.g. filtering Windows paths on a Mac).
      *
      * Defaults to the default path separtor for the host OS.
      */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: MapFunction): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}
