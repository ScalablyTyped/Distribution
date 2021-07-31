package typings.materialUiStyles

import typings.materialUiStyles.mergeClassesMergeClassesMod.Classes
import typings.materialUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeClassesMod {
  
  @JSImport("@material-ui/styles/mergeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Classes]
  @scala.inline
  def default(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
}
