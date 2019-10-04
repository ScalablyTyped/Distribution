organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20190322Z-8a4022"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jasmine" % "3.4-dt-20191001Z-65a54f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        