package typings.gulpPlumber.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Prevent pipe breaking caused by errors from gulp plugins */
/** Prevent pipe breaking caused by errors from gulp plugins */
@js.native
trait GulpPlumber extends js.Object {
  /**
    * Returns Stream, that fixes pipe methods on Streams that are next in pipeline.
    * 
    * @param options Sets options as described in the Options interface
    */
  def apply(): ReadWriteStream = js.native
  /**
    * Returns Stream, that fixes pipe methods on Streams that are next in pipeline.
    * 
    * @param errorHandler the function to be attached to the stream on('error')
    */
  def apply(errorHandler: ErrorHandlerFunction): ReadWriteStream = js.native
  def apply(options: Options): ReadWriteStream = js.native
  /** returns default behaviour for pipeline after it was piped */
  def stop(): ReadWriteStream = js.native
}

