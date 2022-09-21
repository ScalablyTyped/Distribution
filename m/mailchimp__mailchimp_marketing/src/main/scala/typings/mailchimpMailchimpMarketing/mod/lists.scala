package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lists {
  
  @JSImport("@mailchimp/mailchimp_marketing", "lists")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addListMember(listId: String, body: AddListMemberBody): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListMember")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  inline def addListMember(listId: String, body: AddListMemberBody, opts: Options): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListMember")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  
  inline def deleteListMember(listId: String, subscriberHash: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteListMemberPermanent(listId: String, subscriberHash: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteListMemberPermanent")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getListMember(listId: String, subscriberHash: String): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  inline def getListMember(listId: String, subscriberHash: String, opts: Options): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  
  /*~ For example, given this definition, someone could write:
    *~   import { subProp } from 'yourModule';
    *~   subProp.foo();
    *~ or
    *~   import * as yourMod from 'yourModule';
    *~   yourMod.subProp.foo();
    */
  inline def setListMember(listId: String, subscriberHash: String, body: SetListMemberBody): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("setListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  inline def setListMember(listId: String, subscriberHash: String, body: SetListMemberBody, opts: Options): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("setListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  
  inline def updateListMember(listId: String, subscriberHash: String, body: UpdateListMemberBody): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  inline def updateListMember(listId: String, subscriberHash: String, body: UpdateListMemberBody, opts: Options): js.Promise[MembersSuccessResponse | MemberErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | MemberErrorResponse]]
  
  inline def updateListMemberTags(listId: String, subscriberHash: String, body: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMemberTags")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
