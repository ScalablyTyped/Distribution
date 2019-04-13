package typings
package listDashStreamLib.listDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamConstructor
  extends ListStreamMethod
     with org.scalablytyped.runtime.Instantiable2[
      /* options */ nodeLib.streamMod.DuplexOptions, 
      /* callback */ js.Function2[/* err */ stdLib.Error, /* data */ js.Array[js.Any], scala.Unit], 
      ListStream
    ]
     with org.scalablytyped.runtime.Instantiable0[ListStream]
     with org.scalablytyped.runtime.Instantiable1[
      (/* options */ nodeLib.streamMod.DuplexOptions) | (/* callback */ js.Function2[/* err */ stdLib.Error, /* data */ js.Array[js.Any], scala.Unit]), 
      ListStream
    ] {
  @JSName("obj")
  var obj_Original: ListStreamMethod = js.native
  def obj(): ListStream = js.native
  def obj(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[_], scala.Unit]): ListStream = js.native
  def obj(options: nodeLib.streamMod.DuplexOptions): ListStream = js.native
  def obj(
    options: nodeLib.streamMod.DuplexOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[_], scala.Unit]
  ): ListStream = js.native
}

