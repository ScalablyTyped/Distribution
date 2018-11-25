package typings
package idyllLib.idyllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdyllInstance
  extends eventsLib.eventsMod.EventEmitter {
  /**
       *
       * if indexIdyllMarkup is provided, compiles it
       *
       * Otherwise, compiles and optionally watches
       * the idyll file at IOptions.inputFile
       *
       */
  def build(): this.type = js.native
  /**
       *
       * if indexIdyllMarkup is provided, compiles it
       *
       * Otherwise, compiles and optionally watches
       * the idyll file at IOptions.inputFile
       *
       */
  def build(indexIdyllMarkup: java.lang.String): this.type = js.native
  /**
       * Returns idyll compiling's options
       */
  def getOptions(): Options = js.native
  /**
       * Returns internal paths used by idyll-cli
       */
  def getPaths(): idyllLib.Paths = js.native
}

