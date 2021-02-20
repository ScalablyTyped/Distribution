package typings.matchMediaMock

import typings.std.MediaQueryList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("match-media-mock", "create")
  @js.native
  def create(): MatchMediaMock = js.native
  
  /**
    * Mock configuration options
    */
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Screen height
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Screen type
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Screen width
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MatchMediaMock extends StObject {
    
    /**
      * Execute query based on provided configuration
      */
    def apply(query: String): MediaQueryList = js.native
    
    /**
      * Set configuration
      */
    def setConfig(config: ConfigOptions): Unit = js.native
  }
}
