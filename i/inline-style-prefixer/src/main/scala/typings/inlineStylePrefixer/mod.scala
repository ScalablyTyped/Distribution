package typings.inlineStylePrefixer

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inline-style-prefixer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPrefixer(staticData: StaticData): Prefix_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixer")(staticData.asInstanceOf[js.Any]).asInstanceOf[Prefix_]
  
  @JSImport("inline-style-prefixer", "prefix")
  @js.native
  val prefix: Prefix_ = js.native
  
  type Plugin = js.Function4[
    /* property */ String, 
    /* value */ Double | String | (js.Array[Double | String]) | Any, 
    /* style */ Any, 
    /* prefixMap */ js.UndefOr[Record[String, js.Array[String]]], 
    js.UndefOr[Double | String | (js.Array[Double | String]) | Any]
  ]
  
  type Prefix_ = js.Function1[/* style */ Any, Any]
  
  trait StaticData extends StObject {
    
    var plugins: js.Array[Plugin]
    
    var prefixMap: Record[String, js.Array[String]]
  }
  object StaticData {
    
    inline def apply(plugins: js.Array[Plugin], prefixMap: Record[String, js.Array[String]]): StaticData = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], prefixMap = prefixMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticData] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPrefixMap(value: Record[String, js.Array[String]]): Self = StObject.set(x, "prefixMap", value.asInstanceOf[js.Any])
    }
  }
}
