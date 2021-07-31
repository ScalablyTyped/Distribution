package typings.ignore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ignore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new ignore manager.
    */
  @scala.inline
  def default(): Ignore = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Ignore]
  @scala.inline
  def default(options: Options): Ignore = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Ignore]
  
  @js.native
  trait Ignore extends StObject {
    
    /**
      * Adds a rule rules to the current manager.
      * @param  {string | Ignore} pattern
      * @returns IgnoreBase
      */
    def add(pattern: String): Ignore = js.native
    /**
      * Adds several rules to the current manager.
      * @param  {string[]} patterns
      * @returns IgnoreBase
      */
    def add(patterns: js.Array[String | Ignore]): Ignore = js.native
    def add(pattern: Ignore): Ignore = js.native
    
    /**
      * Creates a filter function which could filter
      * an array of paths with Array.prototype.filter.
      */
    def createFilter(): js.Function1[/* path */ String, Boolean] = js.native
    
    /**
      * Filters the given array of pathnames, and returns the filtered array.
      * NOTICE that each path here should be a relative path to the root of your repository.
      * @param paths the array of paths to be filtered.
      * @returns The filtered array of paths
      */
    def filter(paths: js.Array[String]): js.Array[String] = js.native
    
    /**
      * Returns Boolean whether pathname should be ignored.
      * @param  {string} pathname a path to check
      * @returns boolean
      */
    def ignores(pathname: String): Boolean = js.native
  }
  
  trait Options extends StObject {
    
    var ignorecase: js.UndefOr[Boolean] = js.undefined
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
      def setIgnorecase(value: Boolean): Self = StObject.set(x, "ignorecase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorecaseUndefined: Self = StObject.set(x, "ignorecase", js.undefined)
    }
  }
}
