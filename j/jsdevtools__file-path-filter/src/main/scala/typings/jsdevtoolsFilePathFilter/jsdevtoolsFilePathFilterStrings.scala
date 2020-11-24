package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdevtoolsFilePathFilterStrings {
  
  @scala.inline
  def exclude: exclude = "exclude".asInstanceOf[exclude]
  
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait exclude extends Filter
  
  @js.native
  sealed trait include extends Filter
}
