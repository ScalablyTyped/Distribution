package typings.koaDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashGraphqlMod {
  import typings.koa.koaMod.Context
  import typings.koa.koaMod.Request
  import typings.koa.koaMod.Response

  type Options = (js.Function3[/* request */ Request, /* repsonse */ Response, /* ctx */ Context, OptionsResult]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
