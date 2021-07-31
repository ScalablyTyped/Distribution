package typings.jsonMergePatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-merge-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def apply(target: js.Object, patch: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def generate(before: js.Object, after: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def merge(patch1: js.Object, patch2: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(patch1.asInstanceOf[js.Any], patch2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
