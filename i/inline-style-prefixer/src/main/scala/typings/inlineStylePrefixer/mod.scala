package typings.inlineStylePrefixer

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inline-style-prefixer", "createPrefixer")
  @js.native
  def createPrefixer(staticData: StaticData): Prefix_ = js.native
  
  @JSImport("inline-style-prefixer", "prefix")
  @js.native
  val prefix: Prefix_ = js.native
  
  type Plugin = js.Function4[
    /* property */ String, 
    /* value */ Double | String | (js.Array[Double | String]) | js.Any, 
    /* style */ js.Any, 
    /* prefixMap */ js.UndefOr[Record[String, js.Array[String]]], 
    js.UndefOr[Double | String | (js.Array[Double | String]) | js.Any]
  ]
  
  type Prefix_ = js.Function1[/* style */ js.Any, js.Any]
  
  @js.native
  trait StaticData extends StObject {
    
    var plugins: js.Array[Plugin] = js.native
    
    var prefixMap: Record[String, js.Array[String]] = js.native
  }
  object StaticData {
    
    @scala.inline
    def apply(plugins: js.Array[Plugin], prefixMap: Record[String, js.Array[String]]): StaticData = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], prefixMap = prefixMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticData]
    }
    
    @scala.inline
    implicit class StaticDataMutableBuilder[Self <: StaticData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPrefixMap(value: Record[String, js.Array[String]]): Self = StObject.set(x, "prefixMap", value.asInstanceOf[js.Any])
    }
  }
}
