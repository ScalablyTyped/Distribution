package typings.iitc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object artifactMod {
  
  object global {
    
    @JSGlobal("Artifact")
    @js.native
    open class Artifact_ () extends StObject {
      
      // 60 minutes on success
      var REFRESH_FAILURE: Double = js.native
      
      // private _layer: L.LayerGroup;
      var REFRESH_JITTER: Double = js.native
      
      // 2 minute random period so not all users refresh at once
      var REFRESH_SUCCESS: Double = js.native
      
      var artifactTypes: StringDictionary[Any] = js.native
      
      // private handleSuccess(data): void;
      // private handleFailure(data): void;
      // private processData(data): void;
      // private processResult(portals): void;
      def clearData(): Unit = js.native
      
      var entities: js.Array[Any] = js.native
      
      /** used to render portals that would otherwise be below the visible level */
      def getArtifactEntities(): js.Array[Any] = js.native
      
      def getArtifactTypes(): js.Array[String] = js.native
      
      def getInterestingPortals(): js.Array[String] = js.native
      
      /** get the artifact data for a specified artifact id (e.g. 'jarvis'), if it exists - otherwise returns something 'false' */
      def getPortalData(guid: String, artifactId: Any): Any = js.native
      
      def idleResume(): Unit = js.native
      
      def isArtifact(`type`: String): Boolean = js.native
      
      /** quick test for portal being relevant to artifacts - of any type */
      def isInterestingPortal(guid: String): Boolean = js.native
      
      def requestData(): Unit = js.native
      
      def setup(): Unit = js.native
      
      /** show artifact dialog */
      def showArtifactList(): Unit = js.native
      
      def updateLayer(): Unit = js.native
    }
    
    @JSGlobal("artifact")
    @js.native
    def artifact: Artifact_ = js.native
    inline def artifact_=(x: Artifact_): Unit = js.Dynamic.global.updateDynamic("artifact")(x.asInstanceOf[js.Any])
  }
}
