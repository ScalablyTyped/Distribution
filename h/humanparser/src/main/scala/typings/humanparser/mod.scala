package typings.humanparser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("humanparser", JSImport.Namespace)
  @js.native
  val ^ : HumanparserStatic = js.native
  
  trait AddressOutput extends StObject {
    
    var address: String
    
    var city: String
    
    var fullAddress: String
    
    var state: String
    
    var zip: String
  }
  object AddressOutput {
    
    inline def apply(address: String, city: String, fullAddress: String, state: String, zip: String): AddressOutput = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], fullAddress = fullAddress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressOutput]
    }
    
    extension [Self <: AddressOutput](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setFullAddress(value: String): Self = StObject.set(x, "fullAddress", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullerNameOutput extends StObject {
    
    var fullName: String
  }
  object FullerNameOutput {
    
    inline def apply(fullName: String): FullerNameOutput = {
      val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullerNameOutput]
    }
    
    extension [Self <: FullerNameOutput](x: Self) {
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HumanparserStatic extends StObject {
    
    def getFullestName(name: String): FullerNameOutput
    
    def parseAddress(address: String): AddressOutput
    
    def parseName(name: String): NameOutput
  }
  object HumanparserStatic {
    
    inline def apply(
      getFullestName: String => FullerNameOutput,
      parseAddress: String => AddressOutput,
      parseName: String => NameOutput
    ): HumanparserStatic = {
      val __obj = js.Dynamic.literal(getFullestName = js.Any.fromFunction1(getFullestName), parseAddress = js.Any.fromFunction1(parseAddress), parseName = js.Any.fromFunction1(parseName))
      __obj.asInstanceOf[HumanparserStatic]
    }
    
    extension [Self <: HumanparserStatic](x: Self) {
      
      inline def setGetFullestName(value: String => FullerNameOutput): Self = StObject.set(x, "getFullestName", js.Any.fromFunction1(value))
      
      inline def setParseAddress(value: String => AddressOutput): Self = StObject.set(x, "parseAddress", js.Any.fromFunction1(value))
      
      inline def setParseName(value: String => NameOutput): Self = StObject.set(x, "parseName", js.Any.fromFunction1(value))
    }
  }
  
  trait NameOutput extends StObject {
    
    var firstName: String
    
    var fullName: String
    
    var lastName: String
    
    var middleName: js.UndefOr[String] = js.undefined
    
    var salutation: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object NameOutput {
    
    inline def apply(firstName: String, fullName: String, lastName: String): NameOutput = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameOutput]
    }
    
    extension [Self <: NameOutput](x: Self) {
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      inline def setSalutation(value: String): Self = StObject.set(x, "salutation", value.asInstanceOf[js.Any])
      
      inline def setSalutationUndefined: Self = StObject.set(x, "salutation", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type _To = HumanparserStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HumanparserStatic = ^
}
