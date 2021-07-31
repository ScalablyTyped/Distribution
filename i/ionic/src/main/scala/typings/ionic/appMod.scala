package typings.ionic

import typings.ionic.anon.Branches
import typings.ionic.anon.PartialPaginateArgsRespon
import typings.ionic.anon.PickAppnameorg
import typings.ionic.definitionsMod.App
import typings.ionic.definitionsMod.AppAssociation
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientCreate
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.httpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("ionic/lib/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/app", "AppClient")
  @js.native
  class AppClient protected ()
    extends ResourceClient
       with ResourceClientLoad[App]
       with ResourceClientCreate[App, AppCreateDetails]
       with ResourceClientPaginate[App] {
    def this(token: String, e: AppClientDeps) = this()
    
    /* CompleteClass */
    override def create(details: AppCreateDetails): js.Promise[App] = js.native
    
    def createAssociation(id: String, association: Branches): js.Promise[AppAssociation] = js.native
    
    def deleteAssociation(id: String): js.Promise[Unit] = js.native
    
    val e: AppClientDeps = js.native
    
    def load(id: String): js.Promise[App] = js.native
    
    def paginate(args: Unit, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    
    val token: String = js.native
  }
  
  @scala.inline
  def formatName(app: PickAppnameorg): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName")(app.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AppClientDeps extends StObject {
    
    val client: IClient
  }
  object AppClientDeps {
    
    @scala.inline
    def apply(client: IClient): AppClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppClientDeps]
    }
    
    @scala.inline
    implicit class AppClientDepsMutableBuilder[Self <: AppClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCreateDetails extends StObject {
    
    val name: String
    
    val org_id: js.UndefOr[String] = js.undefined
  }
  object AppCreateDetails {
    
    @scala.inline
    def apply(name: String): AppCreateDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCreateDetails]
    }
    
    @scala.inline
    implicit class AppCreateDetailsMutableBuilder[Self <: AppCreateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrg_idUndefined: Self = StObject.set(x, "org_id", js.undefined)
    }
  }
}
