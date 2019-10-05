organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.10.0-89b070"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.9-213e16",
  "org.scalablytyped" %%% "angular__core" % "8.2.9-30ab1d",
  "org.scalablytyped" %%% "angular__forms" % "8.2.9-d51bf9",
  "org.scalablytyped" %%% "angular__router" % "8.2.9-174819",
  "org.scalablytyped" %%% "ionic__core" % "4.10.0-2b27db",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-974a95",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-b128ef",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        