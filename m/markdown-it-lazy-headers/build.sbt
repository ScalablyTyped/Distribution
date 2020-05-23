organization := "org.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20200515Z-c701b3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-9acde5",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20200426Z-09bc89",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-53ca59",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
