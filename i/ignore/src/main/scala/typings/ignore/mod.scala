package typings.ignore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Creates new ignore manager.
      */
    inline def apply(): Ignore_ = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Ignore_]
    inline def apply(options: Options): Ignore_ = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Ignore_]
    
    @JSImport("ignore", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isPathValid(pathname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathValid")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait Ignore_ extends StObject {
    
    /**
      * Adds one or several rules to the current manager.
      * @param  {string[]} patterns
      * @returns IgnoreBase
      */
    def add(patterns: String): this.type = js.native
    def add(patterns: js.Array[String | Ignore_]): this.type = js.native
    def add(patterns: Ignore_): this.type = js.native
    
    /**
      * Creates a filter function which could filter
      * an array of paths with Array.prototype.filter.
      */
    def createFilter(): js.Function1[/* pathname */ Pathname, Boolean] = js.native
    
    /**
      * Filters the given array of pathnames, and returns the filtered array.
      * NOTICE that each path here should be a relative path to the root of your repository.
      * @param paths the array of paths to be filtered.
      * @returns The filtered array of paths
      */
    def filter(pathnames: js.Array[Pathname]): js.Array[Pathname] = js.native
    
    /**
      * Returns Boolean whether pathname should be ignored.
      * @param  {string} pathname a path to check
      * @returns boolean
      */
    def ignores(pathname: Pathname): Boolean = js.native
    
    /**
      * Returns whether pathname should be ignored or unignored
      * @param  {string} pathname a path to check
      * @returns TestResult
      */
    def test(pathname: Pathname): TestResult = js.native
  }
  
  trait Options extends StObject {
    
    var allowRelativePaths: js.UndefOr[Boolean] = js.undefined
    
    // For compatibility
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    var ignorecase: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowRelativePaths(value: Boolean): Self = StObject.set(x, "allowRelativePaths", value.asInstanceOf[js.Any])
      
      inline def setAllowRelativePathsUndefined: Self = StObject.set(x, "allowRelativePaths", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    }
  }
  
  type Pathname = String
  
  trait TestResult extends StObject {
    
    var ignored: Boolean
    
    var unignored: Boolean
  }
  object TestResult {
    
    inline def apply(ignored: Boolean, unignored: Boolean): TestResult = {
      val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], unignored = unignored.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    extension [Self <: TestResult](x: Self) {
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setUnignored(value: Boolean): Self = StObject.set(x, "unignored", value.asInstanceOf[js.Any])
    }
  }
}
