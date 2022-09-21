package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dn {
  
  @js.native
  trait DN extends StObject {
    
    /** Checks whether this DN is the child of another DN */
    def childOf(dn: String): Boolean = js.native
    def childOf(dn: DN): Boolean = js.native
    
    /** Checks whether this DN is equivalent to another DN */
    def equals(dn: String): Boolean = js.native
    def equals(dn: DN): Boolean = js.native
    
    /** Returns the string representation the DN according to the given options */
    def format(): String = js.native
    def format(options: FormatOptions): String = js.native
    
    /** Checks whether this DN is empty */
    def isEmpty(): Boolean = js.native
    
    val length: Double = js.native
    
    /** Returns the parent DN */
    def parent(): DN | Null = js.native
    
    /** Checks whether this DN is the parent of another DN */
    def parentOf(dn: String): Boolean = js.native
    def parentOf(dn: DN): Boolean = js.native
    
    /** Pops an RDN from this DN */
    def pop(): typings.ldapjs.mod.dn.RDN = js.native
    
    /** Pushes and RDN to this DN */
    def push(rdn: typings.ldapjs.mod.dn.RDN): Unit = js.native
    
    /** Reverse the RDNs of this DN */
    def reverse(): this.type = js.native
    
    /** Set the default string formatting options */
    def setFormat(option: FormatOptions): Unit = js.native
    
    def shift(): typings.ldapjs.mod.dn.RDN = js.native
    
    def unshift(rdn: typings.ldapjs.mod.dn.RDN): Unit = js.native
  }
  
  @js.native
  trait RDN extends StObject {
    
    /** Check if two RDNs have equal attributes. Order does not affect comparison */
    def equals(rdn: typings.ldapjs.mod.dn.RDN): Boolean = js.native
    
    /** Convert the RDN to its string representation according to the given options */
    def format(): String = js.native
    def format(options: FormatOptions): String = js.native
    
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, opts: StringDictionary[Any]): Unit = js.native
  }
}
