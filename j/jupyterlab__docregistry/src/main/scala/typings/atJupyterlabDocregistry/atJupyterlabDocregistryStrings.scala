package typings.atJupyterlabDocregistry

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.SaveState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabDocregistryStrings {
  @js.native
  sealed trait added extends js.Object
  
  @js.native
  sealed trait completed extends SaveState
  
  @js.native
  sealed trait failed extends SaveState
  
  @js.native
  sealed trait fileType extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait modelFactory extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait started extends SaveState
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait widgetExtension extends js.Object
  
  @js.native
  sealed trait widgetFactory extends js.Object
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fileType: fileType = "fileType".asInstanceOf[fileType]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def modelFactory: modelFactory = "modelFactory".asInstanceOf[modelFactory]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def widgetExtension: widgetExtension = "widgetExtension".asInstanceOf[widgetExtension]
  @scala.inline
  def widgetFactory: widgetFactory = "widgetFactory".asInstanceOf[widgetFactory]
}

