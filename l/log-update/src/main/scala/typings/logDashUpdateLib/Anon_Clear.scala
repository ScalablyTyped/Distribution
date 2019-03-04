package typings
package logDashUpdateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(): scala.Unit
  def create(stream: nodeLib.NodeJSNs.WritableStream): /* import warning: ImportType.apply Failed type conversion: typeof logUpdate */ js.Any
  def done(): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    create: js.Function1[
      nodeLib.NodeJSNs.WritableStream, 
      /* import warning: ImportType.apply Failed type conversion: typeof logUpdate */ js.Any
    ],
    done: js.Function0[scala.Unit]
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, create = create, done = done)
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

