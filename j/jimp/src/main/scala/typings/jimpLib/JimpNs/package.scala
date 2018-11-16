package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JimpNs {
  type ChangeName = jimpLib.jimpLibStrings.background | jimpLib.jimpLibStrings.scan | jimpLib.jimpLibStrings.crop
  type ColorActionName = jimpLib.jimpLibStrings.mix | jimpLib.jimpLibStrings.tint | jimpLib.jimpLibStrings.shade | jimpLib.jimpLibStrings.xor | jimpLib.jimpLibStrings.red | jimpLib.jimpLibStrings.green | jimpLib.jimpLibStrings.blue | jimpLib.jimpLibStrings.hue
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ nodeLib.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ Jimp, 
    /* err */ nodeLib.Error | scala.Null, 
    /* value */ Jimp, 
    /* coords */ jimpLib.Anon_Y, 
    U
  ]
  type ListenableName = jimpLib.jimpLibStrings.any | jimpLib.jimpLibStrings.initialized | jimpLib.jimpLibStrings.`before-change` | jimpLib.jimpLibStrings.changed | jimpLib.jimpLibStrings.`before-clone` | jimpLib.jimpLibStrings.cloned | ChangeName
  type ListenerData[T /* <: ListenableName */] = jimpLib.Anon_EventName[T] | jimpLib.Anon_Key[T]
  type PrintableText = js.Any | jimpLib.Anon_Text
}
