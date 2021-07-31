package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowV2 {
  
  /**
    * Dialogflow API
    *
    * Builds conversational interfaces (for example, chatbots, and voice-powered
    * apps and devices).
    *
    * @example
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * @namespace dialogflow
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Dialogflow
    */
  @JSImport("googleapis", "dialogflow_v2.Dialogflow")
  @js.native
  class Dialogflow protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.Dialogflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent")
  @js.native
  class ResourceProjectsAgent protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgent {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Entitytypes")
  @js.native
  class ResourceProjectsAgentEntitytypes protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentEntitytypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Entitytypes$Entities")
  @js.native
  class ResourceProjectsAgentEntitytypesEntities protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentEntitytypesEntities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Intents")
  @js.native
  class ResourceProjectsAgentIntents protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentIntents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Sessions")
  @js.native
  class ResourceProjectsAgentSessions protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentSessions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Sessions$Contexts")
  @js.native
  class ResourceProjectsAgentSessionsContexts protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentSessionsContexts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Agent$Sessions$Entitytypes")
  @js.native
  class ResourceProjectsAgentSessionsEntitytypes protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsAgentSessionsEntitytypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dialogflow_v2.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.dialogflowV2Mod.dialogflowV2.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
