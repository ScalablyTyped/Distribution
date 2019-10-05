package typings.locutus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus/php/url", JSImport.Namespace)
@js.native
object phpUrlMod extends js.Object {
  @js.native
  object base64_decode extends js.Object {
    def apply(): js.Any = js.native
    def apply(encodedData: js.Any): js.Any = js.native
  }
  
  @js.native
  object base64_encode extends js.Object {
    def apply(): js.Any = js.native
    def apply(stringToEncode: js.Any): js.Any = js.native
  }
  
  @js.native
  object http_build_query extends js.Object {
    def apply(): js.Any = js.native
    def apply(formdata: js.Any): js.Any = js.native
    def apply(formdata: js.Any, numericPrefix: js.Any): js.Any = js.native
    def apply(formdata: js.Any, numericPrefix: js.Any, argSeparator: js.Any): js.Any = js.native
  }
  
  @js.native
  object parse_url extends js.Object {
    def apply(): js.Any = js.native
    def apply(str: js.Any): js.Any = js.native
    def apply(str: js.Any, component: js.Any): js.Any = js.native
  }
  
  @js.native
  object rawurldecode extends js.Object {
    def apply(): js.Any = js.native
    def apply(str: js.Any): js.Any = js.native
  }
  
  @js.native
  object rawurlencode extends js.Object {
    def apply(): js.Any = js.native
    def apply(str: js.Any): js.Any = js.native
  }
  
  @js.native
  object urldecode extends js.Object {
    def apply(): js.Any = js.native
    def apply(str: js.Any): js.Any = js.native
  }
  
  @js.native
  object urlencode extends js.Object {
    def apply(): js.Any = js.native
    def apply(str: js.Any): js.Any = js.native
  }
  
}

