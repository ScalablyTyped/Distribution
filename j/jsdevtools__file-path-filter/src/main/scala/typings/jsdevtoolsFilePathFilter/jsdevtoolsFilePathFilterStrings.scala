package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdevtoolsFilePathFilterStrings {
  
  @js.native
  sealed trait exclude
    extends StObject
       with Filter
  inline def exclude: exclude = "exclude".asInstanceOf[exclude]
  
  @js.native
  sealed trait include
    extends StObject
       with Filter
  inline def include: include = "include".asInstanceOf[include]
}
