package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRenderToStringMod {
  
  @JSImport("@ionic/react/dist/types/components/utils/ionRenderToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ionRenderToString(html: String, userAgent: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ionRenderToString")(html.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def ionRenderToString(
    html: String,
    userAgent: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializeDocumentOptions */ js.Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ionRenderToString")(html.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
