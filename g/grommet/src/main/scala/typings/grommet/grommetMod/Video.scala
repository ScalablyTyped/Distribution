package typings.grommet.grommetMod

import typings.grommet.componentsVideoMod.VideoProps
import typings.grommet.grommetStrings.controls
import typings.grommet.utilsMod.Omit
import typings.react.HTMLVideoElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.VideoHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Video")
@js.native
class Video protected ()
  extends Component[
      VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ])) = this()
  def this(
    props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]),
    context: js.Any
  ) = this()
}

