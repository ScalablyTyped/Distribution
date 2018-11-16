package typings
package gruntLib.gruntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
     * Grunt module mixins.
     */

@js.native
trait IConfigComponents
  extends gruntLib.gruntNs.configNs.ConfigModule {
  /**
           * An alias
           * @see grunt.config.ConfigModule.init
           */
  def initConfig(config: gruntLib.gruntNs.configNs.IProjectConfig): scala.Unit = js.native
}

