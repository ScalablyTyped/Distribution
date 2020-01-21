package typings.hark.mod

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: HTMLAudioElement): Harker = js.native
  def apply(stream: HTMLAudioElement, option: Option): Harker = js.native
  def apply(stream: HTMLVideoElement): Harker = js.native
  def apply(stream: HTMLVideoElement, option: Option): Harker = js.native
  def apply(stream: MediaStream): Harker = js.native
  def apply(stream: MediaStream, option: Option): Harker = js.native
}

