package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserHandler_ extends StObject {
  
  def cognitoAttributesToJson(sub: js.Array[AttributeType]): js.Promise[js.Object] = js.native
  
  def findAdminUserByEmail(email: String): js.Promise[Any] = js.native
  
  def findCoStaffUserByEmail(email: String): js.Promise[QueryOutput] = js.native
  
  def findCoStaffUserByEmplNumber(employee_number: String): js.Promise[QueryOutput] = js.native
  
  def findConciergeByEmplNumber(employee_number: String): js.Promise[QueryOutput] = js.native
  
  def findStaffUserByEmail(email: String): js.Promise[QueryOutput] = js.native
  
  def findUserByEmail(email: String): js.Promise[Any] = js.native
  
  def findUserByEmployeeNumber(employee_number: String): js.Promise[Any] = js.native
  
  def findUserInAdminUsers(sub: String): js.Promise[QueryOutput] = js.native
  
  def findUserInCoStaffUsers(sub: String): js.Promise[QueryOutput] = js.native
  
  def findUserInConciergeUsers(sub: String): js.Promise[QueryOutput] = js.native
  
  def findUserInDB(sub: String): js.Promise[Any] = js.native
  
  def findUserInStaffUsers(sub: String): js.Promise[QueryOutput] = js.native
  
  def getCognitoUser(AccessToken: String): js.Promise[GetUserResponse] = js.native
  
  def getUserFromJWT(AccessToken: String): js.Promise[GetUserResponse] = js.native
  
  def permissionsValidate(user: User, level: String): js.Promise[String] = js.native
  def permissionsValidate(user: User, level: String, company_uuid: String): js.Promise[String] = js.native
  def permissionsValidate(user: User, level: String, company_uuid: String, hotel_uuid: String): js.Promise[String] = js.native
  def permissionsValidate(user: User, level: String, company_uuid: Unit, hotel_uuid: String): js.Promise[String] = js.native
}
