package typings.graphqlDashCompose

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsDefinitionsMod {
  type DirectiveArgs = StringDictionary[js.Any]
  type MaybePromise[T] = js.Promise[T] | T
  type ObjMap[T] = StringDictionary[T]
  type Thunk[T] = js.Function0[T] | T
}
