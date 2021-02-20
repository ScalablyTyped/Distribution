package typings.jqueryBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Matchs extends StObject {
    
    var android: js.UndefOr[Boolean] = js.native
    
    var bb: js.UndefOr[Boolean] = js.native
    
    var blackberry: js.UndefOr[Boolean] = js.native
    
    var chrome: js.UndefOr[Boolean] = js.native
    
    var cros: js.UndefOr[Boolean] = js.native
    
    var desktop: js.UndefOr[Boolean] = js.native
    
    var iemobile: js.UndefOr[Boolean] = js.native
    
    var ipad: js.UndefOr[Boolean] = js.native
    
    var iphone: js.UndefOr[Boolean] = js.native
    
    var ipod: js.UndefOr[Boolean] = js.native
    
    var kindle: js.UndefOr[Boolean] = js.native
    
    var linux: js.UndefOr[Boolean] = js.native
    
    var mac: js.UndefOr[Boolean] = js.native
    
    var mobile: js.UndefOr[Boolean] = js.native
    
    var msedge: js.UndefOr[Boolean] = js.native
    
    var msie: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var opr: js.UndefOr[Boolean] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var playbook: js.UndefOr[Boolean] = js.native
    
    var rv: js.UndefOr[Boolean] = js.native
    
    var safari: js.UndefOr[Boolean] = js.native
    
    var silk: js.UndefOr[Boolean] = js.native
    
    def uaMatch(): Matchs = js.native
    def uaMatch(ua: String): Matchs = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var versionNumber: js.UndefOr[Double] = js.native
    
    var webkit: js.UndefOr[Boolean] = js.native
    
    var win: js.UndefOr[Boolean] = js.native
    
    var `windows phone`: js.UndefOr[Boolean] = js.native
  }
  
  object global {
    
    @js.native
    trait JQueryStatic extends StObject {
      
      var browser: Matchs = js.native
    }
    object JQueryStatic {
      
      @scala.inline
      def apply(browser: Matchs): JQueryStatic = {
        val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQueryStatic]
      }
      
      @scala.inline
      implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrowser(value: Matchs): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Window extends StObject {
      
      var jQBrowser: Matchs = js.native
    }
    object Window {
      
      @scala.inline
      def apply(jQBrowser: Matchs): Window = {
        val __obj = js.Dynamic.literal(jQBrowser = jQBrowser.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setJQBrowser(value: Matchs): Self = StObject.set(x, "jQBrowser", value.asInstanceOf[js.Any])
      }
    }
  }
}
