package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeStaticDefaultsMassload extends StObject {
  
  var data: Any
  
  /**
    * massload configuration
    *
    * It is possible to set this to a standard jQuery-like AJAX config.
    * In addition to the standard jQuery ajax options here you can supply functions for `data` and `url`,
    * the functions will be run in the current instance's scope and a param will be passed indicating which node IDs need to be loaded,
    * the return value of those functions will be used.
    *
    * You can also set this to a function, that function will receive the node IDs being loaded as argument and a second param which is a function (callback) which should be called with the result.
    *
    * Both the AJAX and the function approach rely on the same return value - an object where the keys are the node IDs, and the value is the children of that node as an array.
    *
    *  {
    *      "id1" : [{ "text" : "Child of ID1", "id" : "c1" }, { "text" : "Another child of ID1", "id" : "c2" }],
    *      "id2" : [{ "text" : "Child of ID2", "id" : "c3" }]
    *  }
    *
    * @name $.jstree.defaults.massload
    * @plugin massload
    */
  var url: Any
}
object JSTreeStaticDefaultsMassload {
  
  inline def apply(data: Any, url: Any): JSTreeStaticDefaultsMassload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsMassload]
  }
  
  extension [Self <: JSTreeStaticDefaultsMassload](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
