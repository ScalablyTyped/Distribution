organization := "org.scalablytyped"
name := "markdown-it-link-attributes"
version := "3.0-dt-20200623Z-794c74"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-5658c3",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20200426Z-7f4a4b",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-53ca59",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
