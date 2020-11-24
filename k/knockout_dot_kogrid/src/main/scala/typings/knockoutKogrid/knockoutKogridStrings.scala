package typings.knockoutKogrid

import typings.knockoutKogrid.kg.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knockoutKogridStrings {
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait asc extends Direction
  
  @js.native
  sealed trait desc extends Direction
}
