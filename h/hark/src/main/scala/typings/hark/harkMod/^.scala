package typings.hark.harkMod

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: HTMLAudioElement | HTMLVideoElement | MediaStream): Harker = js.native
  def apply(stream: HTMLAudioElement | HTMLVideoElement | MediaStream, option: Option): Harker = js.native
}

