package typings.maximMazurokGapiClientCloudresourcemanager

import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.EffectiveTagsResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.FoldersResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.LiensResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OperationsResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OrganizationsResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.ProjectsResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.TagBindingsResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.TagKeysResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.TagValuesResource
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.cloudresourcemanager
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.v3
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudresourcemanager {
        
        @JSGlobal("gapi.client.cloudresourcemanager.effectiveTags")
        @js.native
        val effectiveTags: EffectiveTagsResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.liens")
        @js.native
        val liens: LiensResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.tagBindings")
        @js.native
        val tagBindings: TagBindingsResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.tagKeys")
        @js.native
        val tagKeys: TagKeysResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.tagValues")
        @js.native
        val tagValues: TagValuesResource = js.native
      }
      
      /** Load Cloud Resource Manager API v3 */
      inline def load(name: cloudresourcemanager, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: cloudresourcemanager, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
