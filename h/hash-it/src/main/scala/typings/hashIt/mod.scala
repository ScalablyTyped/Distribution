package typings.hashIt

import typings.hashIt.mod.hash.is.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("hash-it", JSImport.Default)
    @js.native
    def apply(`object`: js.Any): Double = js.native
    
    object is {
      
      /**
        * create a comparator for the object passed to determine if a second is equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @JSImport("hash-it", "default.is")
      @js.native
      def apply(`object`: js.Any): js.Function1[/* anotherObject */ js.Any, Boolean] = js.native
      /**
        * create a comparator for the first object passed to determine if the second is equal
        *
        * @param object the object to test against
        * @param anotherObject the object to compare
        * @returns are the objects equal
        */
      @JSImport("hash-it", "default.is")
      @js.native
      def apply(`object`: js.Any, anotherObject: js.Any): Boolean = js.native
      
      /**
        * create a comparator to determine if all of the objects passed are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all objects equal the initial
        */
      @JSImport("hash-it", "default.is.all")
      @js.native
      def all(`object`: js.Any): Comparator = js.native
      /**
        * determine if all of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @JSImport("hash-it", "default.is.all")
      @js.native
      def all(`object`: js.Any, objects: js.Any*): Boolean = js.native
      
      /**
        * create a comparator to determine if any objects are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all the objects equal the initial
        */
      @JSImport("hash-it", "default.is.any")
      @js.native
      def any(`object`: js.Any): Comparator = js.native
      /**
        * determine if any of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @JSImport("hash-it", "default.is.any")
      @js.native
      def any(`object`: js.Any, args: js.Any*): Boolean = js.native
      
      /**
        * create a comparator for the first object passed to determine if a second is not equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @JSImport("hash-it", "default.is.not")
      @js.native
      def not(`object`: js.Any): Comparator = js.native
      /**
        * determine if all of the objects passed are not equal in value to the first
        *
        * @param object the object to test against
        * @param objects the objects to compare
        * @returns are all the objects different from the first
        */
      @JSImport("hash-it", "default.is.not")
      @js.native
      def not(`object`: js.Any, objects: js.Any*): Boolean = js.native
    }
  }
  
  object hash {
    
    @JSImport("hash-it", "hash")
    @js.native
    def apply(`object`: js.Any): Double = js.native
    
    object is {
      
      /**
        * create a comparator for the object passed to determine if a second is equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @JSImport("hash-it", "hash.is")
      @js.native
      def apply(`object`: js.Any): js.Function1[/* anotherObject */ js.Any, Boolean] = js.native
      /**
        * create a comparator for the first object passed to determine if the second is equal
        *
        * @param object the object to test against
        * @param anotherObject the object to compare
        * @returns are the objects equal
        */
      @JSImport("hash-it", "hash.is")
      @js.native
      def apply(`object`: js.Any, anotherObject: js.Any): Boolean = js.native
      
      /**
        * create a comparator to determine if all of the objects passed are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all objects equal the initial
        */
      @JSImport("hash-it", "hash.is.all")
      @js.native
      def all(`object`: js.Any): Comparator = js.native
      /**
        * determine if all of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @JSImport("hash-it", "hash.is.all")
      @js.native
      def all(`object`: js.Any, objects: js.Any*): Boolean = js.native
      
      /**
        * create a comparator to determine if any objects are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all the objects equal the initial
        */
      @JSImport("hash-it", "hash.is.any")
      @js.native
      def any(`object`: js.Any): Comparator = js.native
      /**
        * determine if any of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @JSImport("hash-it", "hash.is.any")
      @js.native
      def any(`object`: js.Any, args: js.Any*): Boolean = js.native
      
      /**
        * create a comparator for the first object passed to determine if a second is not equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @JSImport("hash-it", "hash.is.not")
      @js.native
      def not(`object`: js.Any): Comparator = js.native
      /**
        * determine if all of the objects passed are not equal in value to the first
        *
        * @param object the object to test against
        * @param objects the objects to compare
        * @returns are all the objects different from the first
        */
      @JSImport("hash-it", "hash.is.not")
      @js.native
      def not(`object`: js.Any, objects: js.Any*): Boolean = js.native
      
      type Comparator = js.Function1[/* repeated */ js.Any, Boolean]
    }
  }
}
