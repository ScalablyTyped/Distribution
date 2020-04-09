organization := "org.scalablytyped"
name := "karma-chai-sinon"
version := "0.1.5-dt-20200331Z-10ff80"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20200314Z-8317bf",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200331Z-9f9551",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-c019e4",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
