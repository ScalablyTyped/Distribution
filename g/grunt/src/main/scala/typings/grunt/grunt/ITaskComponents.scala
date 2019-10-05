package typings.grunt.grunt

import typings.grunt.grunt.task.CommonTaskModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskComponents extends CommonTaskModule {
  /**
    * Load tasks from the specified Grunt plugin.
    * This plugin must be installed locally via npm, and must be relative to the Gruntfile.
    * Grunt plugins can be created by using the grunt-init gruntplugin template: grunt init:gruntplugin.
    */
  def loadNpmTasks(pluginName: java.lang.String): Unit = js.native
  /**
    * Load task-related files from the specified directory, relative to the Gruntfile.
    * This method can be used to load task-related files from a local Grunt plugin by
    * specifying the path to that plugin's "tasks" subdirectory.
    */
  def loadTasks(tasksPath: java.lang.String): Unit = js.native
}

