package typings.koaDashSend

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashSendMod {
  type SetHeaders = js.Function3[
    /* import warning: ImportType.apply Failed type conversion: koa.koa.ParameterizedContext<any, {}>['res'] */ /* res */ js.Any, 
    /* path */ String, 
    /* stats */ Stats, 
    js.Any
  ]
}
