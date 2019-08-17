package typings.koaDashSend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashSendMod {
  import typings.node.fsMod.Stats

  type SetHeaders = js.Function3[
    /* import warning: ImportType.apply Failed type conversion: koa.koa.ParameterizedContext<any, {}>['res'] */ /* res */ js.Any, 
    /* path */ String, 
    /* stats */ Stats, 
    js.Any
  ]
}
