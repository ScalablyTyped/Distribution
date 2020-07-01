package typings.koaGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = (js.Function3[
    /* request */ typings.koa.mod.Request, 
    /* response */ typings.koa.mod.Response, 
    /* ctx */ typings.koa.mod.Context, 
    typings.koaGraphql.mod.OptionsResult
  ]) | typings.koaGraphql.mod.OptionsResult
  type OptionsResult = typings.koaGraphql.mod.OptionsData | js.Promise[typings.koaGraphql.mod.OptionsData]
}
