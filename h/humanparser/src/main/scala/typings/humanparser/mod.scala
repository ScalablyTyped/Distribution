package typings.humanparser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("humanparser", JSImport.Namespace)
  @js.native
  val ^ : HumanparserStatic = js.native
  
  @js.native
  trait AddressOutput extends StObject {
    
    var address: String = js.native
    
    var city: String = js.native
    
    var fullAddress: String = js.native
    
    var state: String = js.native
    
    var zip: String = js.native
  }
  object AddressOutput {
    
    @scala.inline
    def apply(address: String, city: String, fullAddress: String, state: String, zip: String): AddressOutput = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], fullAddress = fullAddress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressOutput]
    }
    
    @scala.inline
    implicit class AddressOutputMutableBuilder[Self <: AddressOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullAddress(value: String): Self = StObject.set(x, "fullAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullerNameOutput extends StObject {
    
    var fullName: String = js.native
  }
  object FullerNameOutput {
    
    @scala.inline
    def apply(fullName: String): FullerNameOutput = {
      val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullerNameOutput]
    }
    
    @scala.inline
    implicit class FullerNameOutputMutableBuilder[Self <: FullerNameOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HumanparserStatic extends StObject {
    
    def getFullestName(name: String): FullerNameOutput = js.native
    
    def parseAddress(address: String): AddressOutput = js.native
    
    def parseName(name: String): NameOutput = js.native
  }
  object HumanparserStatic {
    
    @scala.inline
    def apply(
      getFullestName: String => FullerNameOutput,
      parseAddress: String => AddressOutput,
      parseName: String => NameOutput
    ): HumanparserStatic = {
      val __obj = js.Dynamic.literal(getFullestName = js.Any.fromFunction1(getFullestName), parseAddress = js.Any.fromFunction1(parseAddress), parseName = js.Any.fromFunction1(parseName))
      __obj.asInstanceOf[HumanparserStatic]
    }
    
    @scala.inline
    implicit class HumanparserStaticMutableBuilder[Self <: HumanparserStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFullestName(value: String => FullerNameOutput): Self = StObject.set(x, "getFullestName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseAddress(value: String => AddressOutput): Self = StObject.set(x, "parseAddress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseName(value: String => NameOutput): Self = StObject.set(x, "parseName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NameOutput extends StObject {
    
    var firstName: String = js.native
    
    var fullName: String = js.native
    
    var lastName: String = js.native
    
    var middleName: js.UndefOr[String] = js.native
    
    var salutation: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object NameOutput {
    
    @scala.inline
    def apply(firstName: String, fullName: String, lastName: String): NameOutput = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameOutput]
    }
    
    @scala.inline
    implicit class NameOutputMutableBuilder[Self <: NameOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      @scala.inline
      def setSalutation(value: String): Self = StObject.set(x, "salutation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalutationUndefined: Self = StObject.set(x, "salutation", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type _To = HumanparserStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HumanparserStatic = ^
}
