package typings
package listDashStreamLib.listDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamConstructor
  extends ListStreamMethod
     with ScalablyTyped.runtime.Instantiable2[
      /* options */ nodeLib.streamMod.internalNs.DuplexOptions, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* data */ js.Array[js.Any], scala.Unit], 
      ListStream
    ]
     with ScalablyTyped.runtime.Instantiable1[
      (/* callback */ js.Function2[/* err */ nodeLib.Error, /* data */ js.Array[js.Any], scala.Unit]) | (/* options */ nodeLib.streamMod.internalNs.DuplexOptions), 
      ListStream
    ]
     with ScalablyTyped.runtime.Instantiable0[ListStream] {
  @JSName("obj")
  var obj_Original: ListStreamMethod = js.native
  def obj(): ListStream = js.native
  def obj(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Array[_], scala.Unit]): ListStream = js.native
  def obj(options: nodeLib.streamMod.internalNs.DuplexOptions): ListStream = js.native
  def obj(
    options: nodeLib.streamMod.internalNs.DuplexOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Array[_], scala.Unit]
  ): ListStream = js.native
}

