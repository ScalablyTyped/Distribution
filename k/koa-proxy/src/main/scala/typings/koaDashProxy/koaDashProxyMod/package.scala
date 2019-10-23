package typings.koaDashProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashProxyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.koa.koaMod.Request

  type IndexedObject = StringDictionary[String]
  type MapFunction = js.Function1[/* path */ String, String]
  type RequestOptionFunc = js.Function2[/* request */ Request, /* opts */ js.Any, js.Any]
}
