organization := "org.scalablytyped"
name := "markdown-it-link-attributes"
version := "3.0-dt-20200623Z-af4e05"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-c8a3fc",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20201109Z-8134d4",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-c7d5f3",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
