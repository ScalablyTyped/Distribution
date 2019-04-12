package typings
package atHapiCatboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCatboxMod {
  type EnginePrototypeOrObject = EnginePrototype[js.Any] | ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[/* id */ Id, /* flags */ GenerateFuncFlags, js.Promise[T]]
  type Id = java.lang.String | atHapiCatboxLib.Anon_Id
}
