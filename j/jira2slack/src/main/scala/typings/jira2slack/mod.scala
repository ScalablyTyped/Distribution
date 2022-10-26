package typings.jira2slack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jira2slack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJira(slackMD: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJira")(slackMD.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toSlack(jiraMD: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSlack")(jiraMD.asInstanceOf[js.Any]).asInstanceOf[String]
}
