package typings
package grommetLib.componentsVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Video", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Video: reactLib.reactMod.ComponentClass[
    VideoProps with (reactLib.reactMod.DetailedHTMLProps[
      reactLib.reactMod.VideoHTMLAttributes[reactLib.HTMLVideoElement], 
      reactLib.HTMLVideoElement
    ]) with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.VideoHTMLAttributes[reactLib.HTMLVideoElement], 
        reactLib.HTMLVideoElement
      ], 
      grommetLib.grommetLibStrings.controls
    ]), 
    reactLib.reactMod.ComponentState
  ] = js.native
}

