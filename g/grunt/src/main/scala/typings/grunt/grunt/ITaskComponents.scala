package typings.grunt.grunt

import typings.grunt.grunt.task.CommonTaskModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskComponents
  extends StObject
     with CommonTaskModule {
  
  /**
    * Load tasks from the specified Grunt plugin.
    * This plugin must be installed locally via npm, and must be relative to the Gruntfile.
    * Grunt plugins can be created by using the grunt-init gruntplugin template: grunt init:gruntplugin.
    */
  def loadNpmTasks(pluginName: String): Unit = js.native
  
  /**
    * Load task-related files from the specified directory, relative to the Gruntfile.
    * This method can be used to load task-related files from a local Grunt plugin by
    * specifying the path to that plugin's "tasks" subdirectory.
    */
  def loadTasks(tasksPath: String): Unit = js.native
}
