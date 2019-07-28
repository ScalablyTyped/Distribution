package typings.grommet.componentsVideoMod

import typings.grommet.grommetStrings.controls
import typings.grommet.utilsMod.Omit
import typings.react.HTMLVideoElement
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.VideoHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Video", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Video: ComponentClass[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ]), 
    ComponentState
  ] = js.native
}

