package typings.jimpCore

import typings.jimpCore.etcMod.ChangeName
import typings.jimpCore.etcMod.ListenableName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jimpCoreStrings {
  @js.native
  sealed trait any extends ListenableName
  
  @js.native
  sealed trait background
    extends ChangeName
       with ListenableName
  
  @js.native
  sealed trait `before-change` extends ListenableName
  
  @js.native
  sealed trait `before-clone` extends ListenableName
  
  @js.native
  sealed trait changed extends ListenableName
  
  @js.native
  sealed trait `class` extends js.Object
  
  @js.native
  sealed trait clone extends js.Object
  
  @js.native
  sealed trait cloned extends ListenableName
  
  @js.native
  sealed trait constants extends js.Object
  
  @js.native
  sealed trait constructor extends js.Object
  
  @js.native
  sealed trait crop
    extends ChangeName
       with ListenableName
  
  @js.native
  sealed trait initialized extends ListenableName
  
  @js.native
  sealed trait scan
    extends ChangeName
       with ListenableName
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  @scala.inline
  def `before-change`: `before-change` = "before-change".asInstanceOf[`before-change`]
  @scala.inline
  def `before-clone`: `before-clone` = "before-clone".asInstanceOf[`before-clone`]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
  @scala.inline
  def cloned: cloned = "cloned".asInstanceOf[cloned]
  @scala.inline
  def constants: constants = "constants".asInstanceOf[constants]
  @scala.inline
  def constructor: constructor = "constructor".asInstanceOf[constructor]
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  @scala.inline
  def initialized: initialized = "initialized".asInstanceOf[initialized]
  @scala.inline
  def scan: scan = "scan".asInstanceOf[scan]
}

